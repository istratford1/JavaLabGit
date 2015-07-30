package javalab.day8.mediaLibrary.Library;
import java.text.SimpleDateFormat;
import java.util.*;

public class LibraryItem{


	private String catalogRef;
	
	private Calendar addedDate;
	
	private String memberRef;
	
	private Calendar dueBackDate;
	
	private Calendar lastLentDate;
	
	private String mediaType;
	
	
    public void resetLentStatus(){
    	this.dueBackDate = null;
    	this.memberRef = null;
    	
    }
	
	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}


	
	public Calendar getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Calendar addedDate) {
		this.addedDate = addedDate;
	}


	
	
	public String getCatalogRef() {
		return catalogRef;
	}

	public void setCatalogRef(String catalogRef) {
		this.catalogRef = catalogRef;
	}

	public String getMemberRef() {
		return memberRef;
	}

	public void setMemberRef(String memberRef) {
		this.memberRef = memberRef;
	}

	public Calendar getDueBackDate() {
		return dueBackDate;
	}

	public void setDueBackDate(Calendar dueBackDate) {
		this.dueBackDate = dueBackDate;
	}

	public Calendar getLastLentDate() {
		return lastLentDate;
	}

	public void setLastLentDate(Calendar lastLentDate) {
		this.lastLentDate = lastLentDate;
	}

	public LibraryItem() {
		// TODO Auto-generated constructor stub
	}
	
	 @Override public String toString(){
		StringBuilder s = new StringBuilder();
		String lendStatus = (memberRef != null ? "|" + "current borrower " + memberRef + "|" + " due back on " + myDateStr(dueBackDate): " available " );
		s.append(catalogRef + "|"  + lendStatus); 
		return s.toString();
		
	}
	 
	public String myDateStr(Date date){
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MMM/YYYY");   // lowercase "dd"
		return formatter.format(date.getTime() );
		
	}
	
	public String myDateStr(Calendar cal){
		return myDateStr(cal.getTime());
		
	}
	
	
	
	
	
	

}
