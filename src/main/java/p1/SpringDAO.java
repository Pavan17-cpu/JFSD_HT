package p1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class SpringDAO 
{

	HibernateTemplate ht;// heap memeory is not created


	public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public void insert(Reunion r)
	{
		ht.save(r);
	}
	public void update(Reunion r)
	{
		ht.update("id", r);
		
	}
	public Reunion find(int id)
	{
		return (Reunion) ht.get(Reunion.class, id);
		
	}
	public void delete(int id)
	{
		Reunion r = find(id);
		ht.delete(r);
	}
	public List<Reunion> findall(){
		return ht.loadAll(Reunion.class);
		
		
	}		
}