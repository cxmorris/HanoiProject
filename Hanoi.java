
public class HanoiProject {

	public static void main(String[]args) {
		System.out.println("Example steps when tower has 3 disks:");
		moveStacks(3,"Source","End","Auxiliary");
		System.out.println();
		System.out.println("Example steps when tower has 10 disks:");
		moveStacks(10,"Source","End","Auxiliary");
	}
	public static void moveStacks (int size, String start, String end, String mid) {
		//size is the number of disks on starting tower
		if (size==0) {
			return;
			//ends when no disks are left on the start
		}
		moveStacks(size-1,start,mid,end);
		//first recursive call moves all disks except the last one to middle tower
		System.out.println("Moving disk "+size+" from "+start+" to "+end);
		//moves the one disk from start to end tower
		moveStacks(size-1,mid,end,start);
		//second recursive call moves all but last disk from middle tower to end tower
		
	}
		
}
