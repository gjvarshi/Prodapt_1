document.addEventListener('DOMContentLoaded', function () {
    document.querySelector('form').addEventListener('submit', function (e) {
        e.preventDefault(); 

        // Get user input values
        var name = document.getElementById('name').value.trim();
        var email = document.getElementById('email').value.trim();
        var contact = document.getElementById('contact').value.trim();
        var account = document.getElementById('account').value.trim();

       // Validate name
       var nameRegex = /^[A-Za-z]+(?: [A-Za-z]+)?$/; 
       if (!nameRegex.test(name)) {
           alert('Please enter a valid name with alphabets only and an optional space between first and last name.');
           return;
       }

        // Validate email
        var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailRegex.test(email)) {
            alert('Please enter a valid email address.');
            return;
        }

        // Validate contact number
        var contactRegex = /^[7-9]\d{9}$/; 
        if (!contactRegex.test(contact)) {
            alert('Please enter a valid 10-digit contact number starting with 7, 8, or 9.');
            return;
        }

        // Create a new table row
        var newRow = document.createElement('tr');
        newRow.innerHTML = '<td>' + name + '</td><td>' + email + '</td><td>' + contact + '</td><td>' + account + '</td>';

        // Append the new row to the table body
        document.querySelector('table tbody').appendChild(newRow);

        // Clear the form fields
        document.getElementById('name').value = '';
        document.getElementById('email').value = '';
        document.getElementById('contact').value = '';
        document.getElementById('account').selectedIndex = 0; 
    });
});

