// This code was generated by GenerateDataObjects
package net.sf.borg.model;


import java.util.*;
import net.sf.borg.model.db.KeyedBean;

public class Appointment extends KeyedBean implements java.io.Serializable {

	private Date Date_;
	public Date getDate() { return( Date_ ); }
	public void setDate( Date xx ){ Date_ = xx; }

	private Integer Duration_;
	public Integer getDuration() { return( Duration_ ); }
	public void setDuration( Integer xx ){ Duration_ = xx; }

	private String Text_;
	public String getText() { return( Text_ ); }
	public void setText( String xx ){ Text_ = xx; }

	private Vector SkipList_;
	public Vector getSkipList() { return( SkipList_ ); }
	public void setSkipList( Vector xx ){ SkipList_ = xx; }

	private Date NextTodo_;
	public Date getNextTodo() { return( NextTodo_ ); }
	public void setNextTodo( Date xx ){ NextTodo_ = xx; }

	private Integer SN_;
	public Integer getSN() { return( SN_ ); }
	public void setSN( Integer xx ){ SN_ = xx; }

	private Integer Vacation_;
	public Integer getVacation() { return( Vacation_ ); }
	public void setVacation( Integer xx ){ Vacation_ = xx; }

	private Integer Holiday_;
	public Integer getHoliday() { return( Holiday_ ); }
	public void setHoliday( Integer xx ){ Holiday_ = xx; }

	private boolean Private_;
	public boolean getPrivate() { return( Private_ ); }
	public void setPrivate( boolean xx ){ Private_ = xx; }

	private Integer Times_;
	public Integer getTimes() { return( Times_ ); }
	public void setTimes( Integer xx ){ Times_ = xx; }

	private String Frequency_;
	public String getFrequency() { return( Frequency_ ); }
	public void setFrequency( String xx ){ Frequency_ = xx; }

	private boolean Todo_;
	public boolean getTodo() { return( Todo_ ); }
	public void setTodo( boolean xx ){ Todo_ = xx; }

	private String Color_;
	public String getColor() { return( Color_ ); }
	public void setColor( String xx ){ Color_ = xx; }

	private boolean RepeatFlag_;
	public boolean getRepeatFlag() { return( RepeatFlag_ ); }
	public void setRepeatFlag( boolean xx ){ RepeatFlag_ = xx; }

	private String Category_;
	public String getCategory() { return( Category_ ); }
	public void setCategory( String xx ){ Category_ = xx; }

	protected Object clone() {
		Appointment dst = new Appointment();
		dst.setKey( getKey());
		dst.setDate( getDate() );
		dst.setDuration( getDuration() );
		dst.setText( getText() );
		dst.setSkipList( getSkipList() );
		dst.setNextTodo( getNextTodo() );
		dst.setSN( getSN() );
		dst.setVacation( getVacation() );
		dst.setHoliday( getHoliday() );
		dst.setPrivate( getPrivate() );
		dst.setTimes( getTimes() );
		dst.setFrequency( getFrequency() );
		dst.setTodo( getTodo() );
		dst.setColor( getColor() );
		dst.setRepeatFlag( getRepeatFlag() );
		dst.setCategory( getCategory() );
		return(dst);
	}
}
