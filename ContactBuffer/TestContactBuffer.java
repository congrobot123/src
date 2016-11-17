public class TestContactBuffer
{
	public static void main(String[] args) 
	{
		
	}
}

class ContactBuffer
{
	private Collection index = null;
	private static ContactBuffer buffer = null;
	
	public Collection GetIndex()
	{
		return index;
	}

	public static ContactBuffer getInstance()
	{
		if(buffer == null)
		{
			buffer = new ContactBuffer();
		}

		return buffer;
	}

	private ContactBuffer()
	{
		index = new ArrayList();
	}

	public static boolean Insert(Contact contact)
	{
		ContactBuffer buffer = ContactBuffer.getInstance();
		Collection index = buffer.GetIndex();
		return index.add(contact);
	}

	public static boolean Delete(Contact contact)
	{
		ContactBuffer buffer = ContactBuffer.getInstance();
		Collection index = buffer.GetIndex();
		
		Iterator it = index.iterator();
		while(it.hasNext())
		{
			Contact tempcontact = (Contact)it.next();
			if(( contact.GetName() ).equals( tempcontact.GetName() ))
			{
				index.remove(tempcontact);
				return true;
			}
		}

		return false;
	}

	public static Contact Index_Name(String name)
	{
		ContactBuffer buffer = ContactBuffer.getInstance();
		Collection index = buffer.GetIndex();
		
		Iterator it = index.iterator();
		while(it.hasNext())
		{
			Contact tempcontact = (Contact)it.next();
			if(name.equals( tempcontact.GetName() ))
			{
				return tempcontact;
			}
		}

		return null;
	}

	public static boolean Update(Contact contact)
	{
		ContactBuffer buffer = ContactBuffer.getInstance();
		Collection index = buffer.GetIndex();
		
		Iterator it = index.iterator();
		while(it.hasNext())
		{
			Contact tempcontact = (Contact)it.next();
			if(( contact.GetName() ).equals( tempcontact.GetName() ))
			{
				index.remove(tempcontact);
				index.add(contact);
				return true;
			}
		}

		return false;
	}
}

class Contact
{
	private String telnum;
	private String name;
	private String pass;
	private String sex;
	private String remark;

	public void SetTelNum(String telnum)
	{
		this.telnum = telnum;
	}

	public String GetTelNum()
	{
		return telnum;
	}

	public void SetName(String name)
	{
		this.name = name;
	}

	public String GetName()
	{
		return name;
	}

	public void SetPasswd(String passwd)
	{
		this.passwd = passwd;
	}

	public String GetPasswd()
	{
		return passwd;
	}

	public void SetSex(String sex)
	{
		this.sex = sex;
	}

	public String GetSex()
	{
		return sex;
	}

	public void SetRemark(String remark)
	{
		this.remark = remark;
	}

	public String GetRemark()
	{
		return remark;
	}

	public Contact(String telnum, String name, String passwd, String sex, String remark)
	{
		this.telnum = telnum;
		this.name = name;
		this.passwd = passwd;
		this.sex = sex;
		this.remark = remark;
	}
}
