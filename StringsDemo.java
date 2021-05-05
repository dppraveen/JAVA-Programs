class StringsDemo{
	public static void main(String[] args) {
		String s="Hello Java";
		s="Praveen works with java";
		s+=" technology";
		s=s.concat(" great");
		System.out.println(s);
		s= s.toUpperCase();
		System.out.println(s);
		System.out.println("length="+s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.substring(4,9));
		System.out.println(s.substring(5));
	}
}
