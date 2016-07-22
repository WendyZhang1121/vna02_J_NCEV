
final class Flag {
	private volatile boolean flag = true;
	public void toggle() { // Unsafe 
		flag ^= true;
	}
	public boolean getFlag() { // Safe 
		return flag;
	} 
	}
