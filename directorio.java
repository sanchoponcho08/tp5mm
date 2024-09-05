
package tp5;

 public class Directorio {
    private TreeMap<Long, Contacto> contactos;

    public Directorio() {
        contactos = new TreeMap<>();
    }
/*
    public void agregarContacto(Long telefono, Contacto contacto) {
        contactos.put(telefono, contacto);
    }

    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosCiudad = new ArrayList<>();
        for (Contacto c : contactos.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosCiudad.add(c);
            }
        }
        return contactosCiudad;
    }

    public void borrarContacto(Long telefono) {
        contactos.remove(telefono);
    }

    public TreeMap<Long, Contacto> getContactos() {
        return contactos;
        
    }
    
   aparte porque no podia visualizar el diseño */
    
    
}




