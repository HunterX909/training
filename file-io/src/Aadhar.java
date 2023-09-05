
public class Aadhar {
	private final long uid;
	private final String retina;
	
	public Aadhar(long uid, String retina) {
		this.uid = uid;
		this.retina =retina;
	}

	@Override
	public String toString() {
		return "Aadhar [uid=" + uid + ", retina=" + retina + "]";
	}

	public long getUid() {
		return uid;
	}

	public String getRetina() {
		return retina;
	}
//	Immutable objects are objects in Java whose state (i.e., data or properties) cannot be changed 
//	once they are created. Once an immutable object is constructed, its state remains constant 
//	throughout its lifetime
	public static void main(String[] args) {
		Aadhar ad = new Aadhar(67,"retina");
		System.out.println(ad);
	}

}
