(function() {

	$(".del").on("click", function() {
		$(this).parents("tr").remove();
	});

	$(".add").on("click", function() {
		var line = $(this).parents("tr");
		var lineOffset = line.index();
		$("table tr:eq(" + lineOffset + ")").after(line.clone(true));
	});

})()