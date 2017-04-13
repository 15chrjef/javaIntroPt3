public class Oak extends Plant{
	public Oak() {
		//won't work type is private
		//type = 'tree'

		//works -- size is protected/accessible in all child classes
		this.size = "large";

		
	}
}