var main = {
    init : funtion() {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },

    save : function() {
        var data = {
            title: $('#title').val(),
            author: $('#author').val(),
            content: $('#content').val()
        };
    }

    $.ajax({
        type: 'POST',

    })
}