package hw20171228;

public abstract class   Car {
     public int site = 4;//site 表示载客量
     
    
	
	private String name;//车子有型号
     public void summary(){
    	 System.out.println("我是一辆车，车的载客量的"+site);
     }
     void xinghao(){
    	 System.out.println("我的 型号是"+name);
     }
	public int getSite() {
		return site;
	}
	public void setSite(int site) {
		this.site = site;
	}
	
	 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
}
}