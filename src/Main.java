//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Usuario usuario1 = new Usuario();
    Usuario usuario2 = new Usuario();

    usuario1.setUsername("michael");
    usuario1.setActivo(true);
    usuario1.setCorreo("michaelsh2201@gmail.com");
    usuario1.setNivel(5);
    usuario1.desactivar();

    System.out.println(usuario1.getUsername());
    System.out.println(usuario1.getCorreo());
    System.out.println(usuario1.getActivo());
    System.out.println(usuario1.getNivel());

    

}
