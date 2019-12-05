function dataShow() {
	var elems = $(this).attr("data-target-show").split(";")
	for (i in elems) {
		$(elems[i]).fadeIn();
	}
}
						
function dataHide() {
	var elems = $(this).attr("data-target-hide").split(";")
	for (i in elems) {
		$(elems[i]).hide();
	}
}