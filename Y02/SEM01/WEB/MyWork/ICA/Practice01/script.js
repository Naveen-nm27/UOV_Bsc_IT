document.addEventListener("DOMContentLoaded", function() {
    // Form submit handler
    const submit = document.getElementById("submit");
    submit.addEventListener('click', function(event) {
        event.preventDefault();
        document.body.style.backgroundImage = "url('back2.jpeg')";
    });

    // Calculator functionality
    const num1 = document.getElementById("text1");
    const num2 = document.getElementById("text2");
    const operator = document.getElementById("select");

    operator.addEventListener("change", function() {
        let val1 = parseFloat(num1.value);
        let val2 = parseFloat(num2.value);
        let result;

        if (isNaN(val1) || isNaN(val2)) {
            alert("Please enter both numbers!");
            return;
        }

        switch (operator.value) {
            case "1": // add
                result = val1 + val2;
                break;
            case "2": // sub
                result = val1 - val2;
                break;
            case "3": // mul
                result = val1 * val2;
                break;
            case "4": // div
                if (val2 === 0) {
                    alert("Cannot divide by 0");
                    return;
                }
                result = val1 / val2;
                break;
            default:
                alert("Please select an operator");
                return;
        }

        alert("Result: " + result);
    });
    
    // Passenger selection handler
    const passenger = document.getElementById("passenger");
    passenger.addEventListener('change', function() {
        let selectedItem = this.options[this.selectedIndex].text;    
        document.getElementById("numOf").innerText = "Number Of Passengers: " + selectedItem;
    });
    
    // Task 1 - Prompt for name
    const task1 = document.getElementById("task1");
    task1.addEventListener('click', function(e) {
        e.preventDefault();
        let name = prompt("Enter Name");
        if (name) {
            document.getElementById("fname").value = name;
        }
    });
    
    // Task 2 - Clear form
    const task2 = document.getElementById("task2");
    task2.addEventListener('click', function(e) {
        e.preventDefault();
        document.querySelector('form').reset();
        document.getElementById("numOf").innerText = "Number Of Passengers";
    });
    
    // Name validation
    // const fname = document.getElementById("fname");
    // const labelName = document.getElementById("lable-name");
    
    // fname.addEventListener("input", function() {
		// const nameError = document.getElementById("nameError");
        // if (this.value.trim() === "") {
            // nameError.innerHTML = '*';
        // } else {
            // labelName.innerHTML = "Name";
        // }
    // });
});