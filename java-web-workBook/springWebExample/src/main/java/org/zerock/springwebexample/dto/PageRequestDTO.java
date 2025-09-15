package org.zerock.springwebexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDate;
import java.util.Arrays;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {

    @Builder.Default
    @Min(value = 1)
    @Positive
    private int page = 1;

    @Builder.Default
    @Min(value = 10)
    @Max(value = 100)
    @Positive
    private int size = 10;

    // for page and size
    private String link;

    // for searching
    private String[] types;
    private String keyword;
    private boolean finished;
    private LocalDate from;
    private LocalDate to;

    public int getSkip(){
        return (page - 1) * 10;
    }

    public String getLink(){
        StringBuilder st = new StringBuilder();
        st.append("page=" + this.page);
        st.append("&size=" + this.size);

        if (finished){
            st.append("&finished=on");
        }

        if (types != null && types.length > 0){
            for (int i = 0; i < types.length; i++){
                st.append("&types="+types[i]);

            }
        }

        if (keyword != null){
            try {
                st.append("&keyword=" + URLEncoder.encode(keyword,"UTF-8"));
            } catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
        }

        if (from != null){
            st.append("&from=" + from.toString());
        }

        if (to != null){
            st.append("&to=" + to.toString());
        }

        link = st.toString();

        return link;
    }

    public boolean checkType(String type){
        if (types == null || types.length == 0){
            return false;
        }
        return Arrays.stream(types).anyMatch(type::equals);
    }
}
