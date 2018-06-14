var d = new Date();
var year = d.getFullYear();
var month = d.getMonth() + 1;
month = month < 10 ? '0' + month : month;
var day = d.getDate();
day = day < 10 ? '0' + day : day;
var nowDate = year + '/' + month + '/' + day;// 当前日期
var validator;
var currentJS = {
    loaded: function () {
        if (win.getCookie('username')) {
            $('.J_userValidation').remove();
        }
    },
    addDate: function (date, days) {
        var d = new Date(date);
        d.setDate(d.getDate() + days);
        var month = d.getMonth() + 1;
        var day = d.getDate();
        var week = d.getDay();
        var chineseWeek = ['周日', '周一', '周二', '周三', '周四', '周五', '周六'];
        month = month < 10 ? '0' + month : month;
        day = day < 10 ? '0' + day : day;
        return d.getFullYear() + '-' + month + '-' + day + ' ' + chineseWeek[parseInt(week)];
    },
    submit: function () {
        if (validator.form()) {
            // 房间ID(分散式)  房型ID(集中式)
            submitPost['roomId'] = $('input[name="roomId"]').val();

            // 昵称
            submitPost['nickname'] = $('input[name="nickname"]').val();

            // 手机号码
            submitPost['phone'] = $('input[name="phone"]').val();

            // 验证码
            submitPost['code'] = $('input[name="code"]').val();

            // 看房时间
            submitPost['watchTime'] = $('.J_liveDate').attr('data-value') + ' ' + $('.J_liveTime').attr('data-value');

            // 其他要求(客户填写)
            submitPost['remark'] = $('textarea[name="remark"]').val();

            //房型预约处理
            submitPost['comment'] = $('input[name="comment"]').val();
            console.log(submitPost);

            $.post('/watchroom/submit', submitPost, function (data) {
                if (data.code == 0) {
                    $('form').html('<div class="submitSuccess" style="margin-top: 90px;"><p>我们已经收到您的预约，</p><p>我们会在1个工作日内与您取得联系，请保持手机畅通。</p></div>');
                } else {
                    alert(data.msg);
                }
            }, 'json');
        }
        return false;
    }
};
var submitPost = {};
// 发送验证码
$('.J_sendSms').on('click', function () {
    var phone = $(this).parents('form').find('input[name="phone"]').val();
    if (/^1[3,4,5,7,8]\d{9}$/.test(phone)) {
        var sendbtn = $('.J_sendSms');
        sendbtn.addClass('disabled');
        $.ajax({
            type: "post",
            url: "/sms/code",
            data: JSON.stringify({"phone": phone, "csrfmiddlewaretoken": win.getCookie()}),
            contentType: "application/json",
            dataType: "json",
            success: function (data) {
                if (data.code == 0) {
                    var num = 30;
                    var intervalId = setInterval(function () {
                        sendbtn.html('<i></i>请等待(' + num + '秒)');
                        num--;
                    }, 1000);
                    setTimeout(function () {
                        clearInterval(intervalId);
                        sendbtn.html('<i></i>重新发送').removeClass('disabled');
                    }, 31000);
                } else {
                    console.log("发送失败");
                }
            }
        })
        // $.post('http://www.h2ome.cn/sms/code', {phone: phone, csrfmiddlewaretoken: win.getCookie()}, function () {
        //     var num = 30;
        //     var intervalId = setInterval(function () {
        //         sendbtn.html('<i></i>请等待(' + num + '秒)');
        //         num--;
        //     }, 1000);
        //     setTimeout(function () {
        //         clearInterval(intervalId);
        //         sendbtn.html('<i></i>重新发送').removeClass('disabled');
        //     }, 31000);
        // });
    } else {
        var parent = $(this).parents('form');
        if (parent.find('label[for="phone"]').size() == 0) {
            parent.find('input[name="phone"]').parent('dd').append('<label for="phone" class="error">手机号码有误</label>');
        }
    }
});
$(function () {
    currentJS.loaded();


    // 提交表单
    $('.J_watchroomForm').submit(function (e) {
        e.preventDefault();
        currentJS.submit();
    });

    $('.u-select ul').on('click', 'li', function () {
        var u_select = $(this).parents('.u-select');
        u_select.find('span').text($(this).text());
        u_select.removeClass('hover');
        $(this).parents('.u-select').attr('data-value', $(this).attr('data-option'));
    });

    // 生成看房时间
    for (var i = 0; i < 14; i++) {
        var date = currentJS.addDate(nowDate, i);
        var optionSplit = date.split(' ');
        switch (i) {
            case 0:
                optionSplit[1] = '今天'
                break;
            case 1:
                optionSplit[1] = '明天'
                break;
        }
        $('.J_liveDate ul').append('<li data-option="' + optionSplit[0] + '">' + optionSplit[0] + ' ' + optionSplit[1] + '</li>');
        if (i == 0) {
            $('.J_liveDate span').html(optionSplit[0] + ' ' + optionSplit[1]);
            $('.J_liveDate').attr('data-value', optionSplit[0]);
        }
    }
    for (var i = 9; i < 20; i++) {// 生成小时
        i = i < 10 ? '0' + i : i;
        $('.J_liveTime ul').append('<li data-option="' + i + ':00:00">' + i + ':00</li>');
        if (i == 9) {
            $('.J_liveTime span').html(i + ':00');
            $('.J_liveTime').attr('data-value', i + ':00:00');
        }
    }
    $.validator.addMethod("isMobile", function (value, element) {
        var Mobile = /^1[3,4,5,7,8]\d{9}$/;
        return this.optional(element) || (Mobile.test(value));
    }, "");
    validator = $('.J_watchroomForm').validate({
        rules: {
            nickname: {
                required: true
            },
            phone: {
                required: true,
                isMobile: true
            },
            code: {
                required: true
            }
        },
        messages: {
            nickname: {
                required: ''
            },
            phone: {
                required: ''
            },
            code: {
                required: ''
            }
        }
    });
});