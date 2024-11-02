// PASO 1: Crear una clase Estudiante
class Estudiante {
  // Constructor: se usa para crear un nuevo estudiante con matrícula, nombre y nota
  constructor(matricula, nombre, notaFinal) {
    this.matricula = matricula; // Guardar matrícula
    this.nombre = nombre;       // Guardar nombre
    this.notaFinal = parseFloat(notaFinal); // Guardar nota, convertir a número
  }

  // Método para obtener la información del estudiante
  getInfo() {
    return 'Matrícula: ' + this.matricula + '\nNombre: ' + this.nombre + '\nNota Final: ' + this.notaFinal;
  }

  // Método para verificar si el estudiante ha aprobado
  haAprobado() {
    // Si la nota es mayor o igual a 4.0, el estudiante ha aprobado
    return this.notaFinal >= 4.0;
  }
}

// PASO 2: Crear una función que gestione los estudiantes
function gestionEstudiantes() {
  // Simular entrada de datos con prompt (como input en Python)

  // Pedir la matrícula al usuario
  let matricula = prompt("Ingrese la matrícula del estudiante:");
  
  // Pedir el nombre al usuario
  let nombre = prompt("Ingrese el nombre del estudiante:");
  
  // Pedir la nota final al usuario
  let notaFinal = prompt("Ingrese la nota final del estudiante:");

  // PASO 3: Crear un nuevo objeto de la clase Estudiante usando los datos del usuario
  let estudiante = new Estudiante(matricula, nombre, notaFinal);

  // PASO 4: Mostrar la información del estudiante
  console.log(estudiante.getInfo());

  // PASO 5: Verificar si el estudiante ha aprobado y mostrar un mensaje
  if (estudiante.haAprobado()) {
    console.log("El estudiante ha aprobado el curso.");
  } else {
    console.log("El estudiante no ha aprobado el curso.");
  }
}

// PASO 6: Ejecutar la función para que el programa funcione
gestionEstudiantes();
