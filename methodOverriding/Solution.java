package hackerRank2025.methodOverriding;



	class Sports{
		
		String getName() {
			return "Generic Sports";
		}
		
		String getNumberOfTeamMembers() {
			return "Each team has n players in " + getName();
		}
	}
	
	class Soccer extends Sports{
		
		@Override
		String getName() {
			return "Soccer Class";
		}
		
		@Override
		String getNumberOfTeamMembers() {
			return "Each team has 11 players in " + getName();
		}
		
		String superMethod() {
			return super.getNumberOfTeamMembers();
		}
		
		
	}
	public class Solution {
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        String num = c2.getNumberOfTeamMembers();
        
       String s = c2.getClass().getSimpleName().equals("Soccer") ? "11" : "n";
       System.out.println("Soccer has " + s + " members");
	}
}
