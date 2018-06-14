/**
 * 分页函数
 * pno--页数
 * psize--每页显示记录数
 * 分页部分是从真实数据行开始，因而存在加减某个常数，以确定真正的记录数
 * 纯js分页实质是数据行全部加载，通过是否显示属性完成分页功能
 **/
function goPage(pno){
	var itable = document.getElementById("houseData").getElementsByTagName("li");
    var num = itable.length;//表格所有行数(所有记录数)
    console.log(num);
    var totalPage = 0;//总页数
    var pageSize = 3;//每页显示行数
    //总共分几页
    if(num/pageSize > parseInt(num/pageSize)){
        totalPage=parseInt(num/pageSize)+1;
    }else{
        totalPage=parseInt(num/pageSize);
    }
    var currentPage = pno;//当前页数
    var startRow = (currentPage - 1) * pageSize+1;//开始显示的行  31
    var endRow = currentPage * pageSize;//结束显示的行   40
    endRow = (endRow > num)? num : endRow;    //40
    console.log(endRow);
    //遍历显示数据实现分页
    for(var i=1;i<(num+1);i++){
        var irow = itable[i-1];
        if(i>=startRow && i<=endRow){
            irow.style.display = "block";
        }else{
            irow.style.display = "none";
        }
    }
    var pageEnd = document.getElementById("pageEnd");
    var tempStr = "";
 
 
//.bind("click",{"newPage":pageIndex},function(event){
//        goPage((pageIndex-1)*pageSize+1,(pageIndex-1)*pageSize+pageSize);
//    }).appendTo('#pages');
    if(currentPage>1){
        tempStr += "<span class='pagination-btn' href=\"#\" onClick=\"goPage("+(1)+")\">首页</span>";
        tempStr += "<span class='pagination-btn' href=\"#\" onClick=\"goPage("+(currentPage-1)+")\">上一页</span>"
    }else{
        tempStr += "<span class='pagination-btn'>首页</span>";
        tempStr += "<span class='pagination-btn'>上一页</span>";
    }
 
    for(var pageIndex= 1;pageIndex<totalPage+1;pageIndex++){
        tempStr += "<a class='page-btn' onclick=\"goPage("+pageIndex+")\"><span>"+ pageIndex +"</span></a>";
    }
 
    if(currentPage<totalPage){
        tempStr += "<span class='pagination-btn' href=\"#\" onClick=\"goPage("+(currentPage+1)+")\">下一页</span>";
        tempStr += "<span class='pagination-btn' href=\"#\" onClick=\"goPage("+(totalPage)+")\">尾页</span>";
    }else{
        tempStr += "<span class='pagination-btn'>下一页</span>";
        tempStr += "<span class='pagination-btn'>尾页</span>";
    }
    tempStr += "<span style='margin-left:10px;line-height:38px;'>共"+totalPage+"页</span>";
    document.getElementById("barcon").innerHTML = tempStr;



}