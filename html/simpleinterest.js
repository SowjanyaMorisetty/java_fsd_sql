var principle = document.getElementById("principle");
var interest = document.getElementById("interest");
var years = document.getElementById("years");
var outputspan = document.getElementById("outputspan");

//itvoyagers.in
function countSI()
{
	p = parseFloat(principle.value);
	n = parseFloat(years.value);
	r = parseFloat(interest.value);
	si = (p*n*r)/100;
	outputspan.innerHTML = si;
}
