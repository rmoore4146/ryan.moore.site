var common = {

    postToForm: function(uri, map, newWindowBoolean) {
        $('#defaultForm').remove();
        if(newWindowBoolean) {
            $('<form name="defaultForm" action="' + uri + '" method="POST" target="_blank" id="defaultForm"></form>').appendTo(document.body);
        } else {
            $('<form name="defaultForm" action="' + uri + '" method="POST" id="defaultForm"></form>').appendTo(document.body);
        }
        $.each(map, function(key, value) {
            var decodedValue = value;
            if(value!=null){
                decodedValue = decodeURI(value);
            }
            $('<input type="hidden" name="' + key + '" id="' + key + '" value="' + decodedValue + '"/>').appendTo("#defaultForm");
        });
        $('#defaultForm').submit();
    }
};