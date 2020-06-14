(function($) {  
    $('#btnNext').on('click', function () {
    	event.preventDefault();
    	
    	$("#frmStartPage").attr('action', '/transaction/doShowEntry');
    	$("#frmStartPage").submit();
    });

}(jQuery));