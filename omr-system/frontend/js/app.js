function login(){

    let usuario = document.getElementById("usuario").value;
    let password = document.getElementById("password").value;

    // ADMIN

    if(usuario === "admin" && password === "123"){

        window.location.href = "admin/dashboard.html";

    }

    // EVALUADOR

    else if(usuario === "evaluador" && password === "123"){

        window.location.href = "evaluador/dashboard.html";

    }

    else{

        alert("Credenciales incorrectas");

    }

}

// ESTUDIANTE

function ingresarEstudiante(){

    let dni = document.getElementById("dni").value;

    if(dni.length === 8){

        window.location.href = "estudiante/dashboard.html";

    }

    else{

        alert("Ingrese un DNI válido");

    }

}