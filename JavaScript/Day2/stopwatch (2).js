var h = 0;
var m = 0;
var s = 0;
time = true;
function Start() {
    if (time) {
        s++;

        if (s == 60) {
            m++;
            s = 0;
            document.getElementById("m").innerHTML = m;
        }

        if (m == 60) {
            h++;
            m = 0;
            document.getElementById("h").innerHTML = h;
        }
        document.getElementById("s").innerHTML = s;

        setTimeout(Start, 1000);
    }

    else {
        time = true;
    }

}

function Stop() {
    if (time) {
        time = false;
    }
    else {
        time = true;
    }
}

