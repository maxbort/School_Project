class Song{
	String name;
	public Song(String name){
		this.name = name;
	}
	String getTitle(){
		return name;
	}

	public static void main(String[] args){
		Song mysong = new Song("Nessun Dorma");
		Song yoursong = new Song("���ִ� �� ���̷��");
		System.out.println("�� �뷡�� " + mysong.getTitle());
		System.out.println("�� �뷡�� " + yoursong.getTitle());
	}


}