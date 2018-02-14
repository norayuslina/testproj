interface Modem {
	
	public string modemVersion = "V1"

  public boolean open();                               
  public boolean close();
  public int read ();
  public int write(byte[] buffer);
  
  public static String myName() {
	  
	  return "Modem"
  }

}
 