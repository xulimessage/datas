layui.config({
    base: "js/"
}).use(['form', 'layer', 'jquery', 'laypage'], function () {
    var form = layui.form(),
        layer = parent.layer === undefined ? layui.layer : parent.layer,
        laypage = layui.laypage,
        $ = layui.jquery;

    $(".changzhurenkouzhuangtai").click(function () {
            var index = layer.msg('查询中，请稍候', {icon: 16, time: false, shade: 0.8});
            setTimeout(function () {
                layer.msg("hello")
                $.ajax({
                    url: "/getName"
                })
                layer.close(index);
            }, 2000);

        }
    )
    $(".changzhurenkouduiji").click(function () {
            var index = layer.msg('堆积中，请稍候', {icon: 16, time: false, shade: 0.8});

            layer.open({
                type: 2,
                content: '/guotu/xunhuan',
            });
            layer.close(index);


        }
    )
})