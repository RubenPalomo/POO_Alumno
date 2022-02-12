public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;

	public Alumno() {
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
	}

	public Alumno(String nom, String apel, int edad) {
		this.nombre = nom;
		this.apellidos = apel;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String print() {
		return this.nombre + " " + this.apellidos + "\n" + this.edad + " años";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno alumno001 = new Alumno();
		alumno001.setNombre("Aitor");
		alumno001.setApellidos("Menta Tropical");
		alumno001.setEdad(16);
		System.out.println(alumno001.print());

		/* * * * * * * */
		
		int i = 0;

		Alumno[] arrayAlumnos = new Alumno[10];
		arrayAlumnos[0] = new Alumno("Elsa", "Capuntas Morado", 24);
		arrayAlumnos[1] = new Alumno("Alex", "Cremento Grande", 19);
		arrayAlumnos[2] = new Alumno("Alba", "Sura Pérez", 36);
		arrayAlumnos[3] = new Alumno("Ana", "Busado de Hesa", 18);
		arrayAlumnos[4] = new Alumno("Andrés", "Trozado Torres", 24);
		arrayAlumnos[5] = new Alumno("Elvis", "Coque Casimiro", 32);
		arrayAlumnos[6] = new Alumno("Dolores", "Delano Agudo", 56);
		arrayAlumnos[7] = new Alumno("Elton", "Tito Pardillo", 22);
		arrayAlumnos[8] = new Alumno("Lola", "Mento González", 48);
		arrayAlumnos[9] = new Alumno("Zacarías", "Flores del Campo", 62);

		for (i = 0; i < arrayAlumnos.length; i++) {
			System.out.print("\nAlumno #" + (i + 1) + ": " + arrayAlumnos[i].print() + "\n");
		}
	}
}