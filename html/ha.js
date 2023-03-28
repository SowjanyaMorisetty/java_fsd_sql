// Get form and submit button
const form = document.getElementById('employee-form');
const submitBtn = document.getElementById('submit-btn');

// Add event listener to submit button
submitBtn.addEventListener('click', function(event) {
  event.preventDefault(); // prevent form from submitting normally

  // Get form data
  const formData = new FormData(form);

  // Send form data using AJAX
  const xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function() {
    if (this.readyState === 4 && this.status === 200) {
      console.log(this.responseText);
    }
  };

  // Send form data using GET method
  xhr.open('GET', '/submit-employee-data?' + new URLSearchParams(formData).toString());
  xhr.send();

  // Send form data using POST method
  xhr.open('POST', '/submit-employee-data');
  xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
  xhr.send(new URLSearchParams(formData).toString());

  // Clear form data
  form.reset();
});
