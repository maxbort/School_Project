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
		Song yoursong = new Song("공주는 잠 못이루고");
		System.out.println("내 노래는 " + mysong.getTitle());
		System.out.println("너 노래는 " + yoursong.getTitle());
	}


}