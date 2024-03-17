package Biblioteca;


/**
* Biblioteca/Libro.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./Biblioteca.idl
* domingo 17 de marzo de 2024 18H07' CET
*/

public final class Libro implements org.omg.CORBA.portable.IDLEntity
{
  public String titulo = null;
  public String autor = null;
  public String ISBN = null;
  public boolean estaDisponible = false;
  public int cantidad = (int)0;

  public Libro ()
  {
  } // ctor

  public Libro (String _titulo, String _autor, String _ISBN, boolean _estaDisponible, int _cantidad)
  {
    titulo = _titulo;
    autor = _autor;
    ISBN = _ISBN;
    estaDisponible = _estaDisponible;
    cantidad = _cantidad;
  } // ctor

} // class Libro