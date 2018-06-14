var d = new Date();
var year = d.getFullYear();
var month = d.getMonth() + 1;
month = month < 10 ? '0' + month : month;
var day = d.getDate();
day = day < 10 ? '0' + day : day;
var nowDate = year + '-' + month + '-' + day;// 当前日期
var submitPost = {};
var validator;
var currentJS = {
    loaded: function () {
        currentJS.getCitys();
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
        var chineseWeek = ['周末', '周一', '周二', '周三', '周四', '周五', '周六'];
        month = month < 10 ? '0' + month : month;
        day = day < 10 ? '0' + day : day;
        return d.getFullYear() + '-' + month + '-' + day + ' ' + chineseWeek[parseInt(week)];
    },
    submit: function () {
        if (validator.form()) {
            //网站拥有者用户id
            submitPost['userId'] = $('input[name="userId"]').val();
            // 昵称
            submitPost['nickname'] = $('input[name="nickname"]').val();

            // 手机号码
            submitPost['phone'] = $('input[name="phone"]').val();

            // 验证码
            submitPost['code'] = $('input[name="code"]').val();

            // 入住时间
            submitPost['checkinTime'] = $('#liveDate').val();

            // 入住城市
            submitPost['city'] = $('.J_city').attr('data-value') || '上海';

            // 入住区域
            submitPost['district'] = $('.J_district').attr('data-value') || '浦东新区';

            //期望价格
            submitPost['price'] = $('input[name="range"]').val();

            // 其他要求
            submitPost['remark'] = $('textarea[name="remark"]').val();


            $.post('/entrustroom/submit', submitPost, function (data) {
                if (data.code == 0) {
                    $('form').html('<div class="submitSuccess" style="margin-top: 200px;"><p>我们已经收到您的委托，</p><p>我们会在1个工作日内与您取得联系，请保持手机畅通。</p></div>');
                } else {
                    alert(data.msg);
                }
            }, 'json');
        }
        return false;
    },
    getCitys: function () {
        var result = cities.split(",");
        for (var i = 0; i < result.length; i++) {
            $('.J_city ul').append('<li data-option="' + result[i] + '">' + result[i] + '</li>');
            if (i == 0) {
                $('.J_city span').html(result[i]);
                $('.J_city').attr('data-value', result[0]);
                currentJS.getDistricts(result[0]);
            }
        }

    },
    getDistricts: function (city) {
        var _city = city || "上海";
        $.get('/entrustroom/districts', {city: _city, userId: userId}, function (data) {
            console.log(data);
            var result = data.split(",");
            $('.J_district ul').html('');
            for (var i = 0; i < result.length; i++) {
                $('.J_district ul').append('<li data-option="' + result[i] + '">' + result[i] + '</li>');
                if (i == 0) {
                    $('.J_district span').html(result[0]);
                    $('.J_district').attr('data-value', result[0]);
                }
            }
        });
    }
}
$(function () {
    currentJS.loaded();
    // 提交表单
    $('.J_needroomForm').submit(function (e) {
        e.preventDefault();
        currentJS.submit();
    });

    $('.u-select ul').on('click', 'li', function () {
        var u_select = $(this).parents('.u-select');
        u_select.find('span').text($(this).text());
        u_select.removeClass('hover');
        $(this).parents('.u-select').attr('data-value', $(this).attr('data-option'));
    });

    $('.J_range').ionRangeSlider({
        keyboard: true,
        min: 500,
        max: 6000,
        hide_min_max: true,
        hide_from_to: false,
        grid: false,
        type: 'double',
        step: 500,
        prefix: '¥',
        // max_postfix: '+',
        values: [500, 1000, 1500, 2000, 2500, 3000, 3500, 4000, 4500, 5000, 5500, 6000],
        onStart: function (obj) {
            // 期望价格
            submitPost['hopeprice'] = obj.from_value + '-' + obj.to_value;
        },
        onChange: function (obj) {
            // 期望价格
            submitPost['hopeprice'] = obj.from_value + '-' + obj.to_value;
        }
    });

    var liveDates = ['不限', '立即入住', '1周内', '1-2周内', '2-4周内'];


    //改变城市
    $('.J_city').on('click', 'li', function () {
        $('.J_city').attr('data-value', $(this).html());
        currentJS.getDistricts($(this).attr('data-option'));
    });
    //
    $('.J_district').on('click', 'li', function () {
        $('.J_district').attr('data-value', $(this).html());
    });
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
            });
            // $.post('/sms/code', {phone: phone, csrfmiddlewaretoken: win.getCookie()}, function () {
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
                parent.find('input[name="phone"]').parents('dd').append('<label for="phone" class="error"></label>');
            }
        }
    });

    $.validator.addMethod("isMobile", function (value, element) {
        var Mobile = /^1[3,4,5,7,8]\d{9}$/;
        return this.optional(element) || (Mobile.test(value));
    }, "");

    validator = $('.J_needroomForm').validate({
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