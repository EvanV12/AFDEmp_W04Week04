package p07ArraylistHashMap_etc;

public class J01Bunny implements Comparable{
	
	private int number;
	private String name;

	
	public J01Bunny(int n) {
		number = n;
	}
	
	public J01Bunny(int no, String n) {
		number = no;
		name = n;
	}
	
	public J01Bunny(String n, int no) {
		number = no;
		name = n;
	}
	

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void hop() {
		System.out.println("Bunny number " + number + " hoppity hippity hops.");
	}
	
	public boolean equals(Object arg) {
		if (arg == this)
			return true;
		if (arg == null)
			return false;
		if (getClass() != arg.getClass())
			return false;
		J01Bunny bunny = (J01Bunny) arg;
		return (
			(name == bunny.name || (name != null && name.equals(bunny.name)))
			);
		
	}
	
	@Override
	public int compareTo(Object s) {
		return (this.number - ((J01Bunny)s).number);
		
	}
	
	/*@Override
    public boolean equals(Object arg) {
        if(arg==this)//compares the two reports(αναφορες) point to the same object
        return true;
        if(arg==null)
        return false;
        if(getClass()!=arg.getClass())//compares the classes of the two objects if they are equal
        return false;
        Bunny bunny=(Bunny) arg;//converts(via the Casting method) the object that belongs to the Bunny Class
                                //to the same class in order to do the following comparisons
        return (name==bunny.name||name!=null&&name.equals(bunny.name))&&(number==bunny.number);
    }*/
	
}

