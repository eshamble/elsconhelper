function check_pass() {
    if (document.getElementById('password').value ===
            document.getElementById('repeatPassword').value) {
        document.getElementById('signUp').disabled = false;
    } else {
        document.getElementById('signUp').disabled = true;
    }
}
