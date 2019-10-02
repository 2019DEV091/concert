package concertWebsite.model;

public class Concert {

	private String concertName, artistName, venueName, concertDate, concertTime;

	
	public Concert(String concertName, String artistName, String venueName, String concertDate, String concertTime) {
		super();
		this.concertName = concertName;
		this.artistName = artistName;
		this.venueName = venueName;
		this.concertDate = concertDate;
		this.concertTime = concertTime;
	}

	public String getConcertName() {
		return concertName;
	}

	public void setConcertName(String concertName) {
		this.concertName = concertName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getConcertDate() {
		return concertDate;
	}

	public void setConcertDate(String concertDate) {
		this.concertDate = concertDate;
	}

	public String getConcertTime() {
		return concertTime;
	}

	public void setConcertTime(String concertTime) {
		this.concertTime = concertTime;
	}

	@Override
	public String toString() {
		return "Concert [concertName=" + concertName + ", artistName=" + artistName + ", venueName=" + venueName
				+ ", concertDate=" + concertDate + ", concertTime=" + concertTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((concertDate == null) ? 0 : concertDate.hashCode());
		result = prime * result + ((concertName == null) ? 0 : concertName.hashCode());
		result = prime * result + ((concertTime == null) ? 0 : concertTime.hashCode());
		result = prime * result + ((venueName == null) ? 0 : venueName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Concert other = (Concert) obj;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (concertDate == null) {
			if (other.concertDate != null)
				return false;
		} else if (!concertDate.equals(other.concertDate))
			return false;
		if (concertName == null) {
			if (other.concertName != null)
				return false;
		} else if (!concertName.equals(other.concertName))
			return false;
		if (concertTime == null) {
			if (other.concertTime != null)
				return false;
		} else if (!concertTime.equals(other.concertTime))
			return false;
		if (venueName == null) {
			if (other.venueName != null)
				return false;
		} else if (!venueName.equals(other.venueName))
			return false;
		return true;
	}
}
