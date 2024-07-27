const form = document.querySelector('#form');
        const username = document.querySelector('#username');
        const email = document.querySelector('#email');
        const password = document.querySelector('#password');
        const cpassword = document.querySelector('#cpassword');

        form.addEventListener('submit',(e)=>{
            if(verify()){
                e.preventDefault();
            }
            else{
                alert("Form Submitted Successfully...");
            }
        })

        function verify(){
            const usernameValue = username.value.trim();
            const emailValue = email.value.trim();
            const passwordValue = password.value.trim();
            const cpasswordValue = cpassword.value.trim();
            let success = true;
            
            if(usernameValue === ''){
                success = false;
                setError(username, "Username is required");
            }
            else{
                setSuccess(username);
            }

            if(emailValue === ''){
                success = false;
                setError(email, "Email is required");
            }
            else if(!verifyEmail(emailValue)){
                success = false;
                setError(email, "Please enter a valid email");
            }
            else{
                setSuccess(email);
            }

            if(passwordValue === ''){
                success = false;
                setError(password, "Password is required");
            }
            else if(passwordValue.length<8){
                success = false;
                setError(password, "Password must contains atleast 8 characters");
            }
            else{
                setSuccess(password);
            }

            if(cpasswordValue === ''){
                success = false;
                setError(password, "Password is required");
            }
            else if(cpassword!==passwordValue){
                success = false;
                setError(cpassword, "Password doesn't match");
            }
            else{
                setSuccess(cpassword);
            }

            return true;

        }

        function setError(element, message){
            const inputGroup = element.parentElement;
            const errorElemet = inputGroup.querySelector('.error');

            errorElemet.innerText = '';
            inputGroup.classList.add('error');
            inputGroup.classList.remove('success')
        }

        function setSuccess(element){
            const inputGroup = element.parentElement;
            const errorElemet = inputGroup.querySelector('.error');

            errorElement.innerText = '';
            inputGroup.classList.add('success');
            inputGroup.classList.remove('error')
        }

        const verifyEmail = (email) => {
            return String(email).toLowerCase().match(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$/);

        }


