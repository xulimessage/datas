layui.config({
    base: "js/"
}).use(['form', 'layer', 'jquery', 'laypage'], function () {
        var form = layui.form(),
            layer = parent.layer === undefined ? layui.layer : parent.layer,
            laypage = layui.laypage,
            $ = layui.jquery;

        //加载页面数据
        /*

            var newsData = '';
            $.get("/getAll", function (data) {
                var newArray = [];

                //正常加载信息
                // newsData = data;
                //newsData = JSON.parse(addNews).concat(newsData);
                // if (window.sessionStorage.getItem("addNews")) {
                //     var addNews = window.sessionStorage.getItem("addNews");
                //     newsData = JSON.parse(addNews).concat(newsData);
                //     //执行加载数据的方法
                //     // newsList();
                /!* for (var i = 0; i < newsData.size; i++) {
                     alert(data[i].id)
                 }*!/



            })
        */


//加载页面数据
        var newsData = '';
        $.get("/getAll", function (data) {
            var newArray = [];
            //单击首页“待审核文章”加载的信息

            //正常加载信息
            newsData = data;

            //执行加载数据的方法
            newsList();

        })

        function newsList(that) {
            //渲染数据
            function renderDate(newsData, curr) {
                var dataHtml = '';


                for (var i = 0; i < newsData.length; i++) {
                    dataHtml += '<tr>'
                        + '<td><input type="checkbox" name="checked" lay-skin="primary" lay-filter="choose"></td>'
                        + '<td align="left">' + newsData[i].id + '</td>'
                        + '<td>' + newsData[i].name + '</td>'
                        + '<td>' + newsData[i].parent_id + '</td>'
                        + '<td>' + newsData[i].level_id + '</td>'
                        + '<td>' + newsData[i].interface_url + '</td>'
                        + '<td>' + newsData[i].appid + '</td>'
                        + '<td>' + newsData[i].is_provide + '</td>'
                        + '<td>' + newsData[i].is_exits + '</td>';


                }
                return dataHtml;
            }

            //分页
            var nums = 13; //每页出现的数据量
            if (that) {
                newsData = that;
            }
            laypage({
                cont: "page",
                pages: Math.ceil(newsData.length / nums),
                jump: function (obj) {
                    $(".API_content").html(renderDate(newsData, obj.curr));
                    // $('.news_list thead input[type="checkbox"]').prop("checked", false);
                    form.render();
                }
            })
        }
    }
)
