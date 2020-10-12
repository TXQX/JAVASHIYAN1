package pack1;

public class PC {
	CPU cpu;
	HardDisk disk;
	void setCPU(CPU cpu){
		this.cpu=cpu;
	}
	void setHardDisk(HardDisk disk){
		this.disk=disk;
	}
	void show(){
		System.out.println("CPU的速度"+cpu.getSpeed());
		System.out.println("硬盘的容量"+disk.getAmount());
	}
	

}
