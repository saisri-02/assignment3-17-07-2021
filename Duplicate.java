class Duplicate
{
public static void main(String args[]) 
{
Set<Integer> s=new HashSet<Integer>();
for(int i:nums)
{
if(s.contains(i))
return true;
s.add(i);
}
return false;
}
}

