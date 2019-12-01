package weatherInfo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThiGradeDTO {
	private String date; //SAWS_OBS_TM 관측일자
	private String stationName; //STN_NM 지점명
	private String thiGrade; //불쾌지수 등급
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append("\n날짜 : ");
		builder.append(date + "\n");
		builder.append("지점명 : ");
		builder.append(stationName + "\n");
		builder.append("불쾌지수 등급 : ");
		builder.append(thiGrade + "\n");
		return builder.toString();
		
	}
}
