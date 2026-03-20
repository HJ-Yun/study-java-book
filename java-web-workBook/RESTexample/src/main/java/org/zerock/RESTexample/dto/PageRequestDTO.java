package org.zerock.RESTexample.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.zerock.RESTexample.domain.Board;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {

    @Builder.Default
    private int page = 1;

    @Builder.Default
    private int size = 10;

    private String type; // t, c, w, tc, tw, twc

    private String keyword;

    private String link;

    public String[] getTypes(){
        if (type == null || type.isEmpty()){
            return null;
        }
        return type.split("");
    }

    public Pageable getPagealbe(String...props){
        return PageRequest.of(this.page-1, this.size, Sort.by(props).descending());
    }

    public String getLink(){
        if (link == null){
            StringBuilder st = new StringBuilder();

            st.append("page=" + this.page);
            st.append("&size=" + this.size);

            if (type != null && type.length() > 0){
                st.append("&type=" + this.type);
            }

            if (keyword != null){
                try {
                    st.append("&keyword=" + URLEncoder.encode(keyword,"UTF-8"));
                } catch (UnsupportedEncodingException e){

                }
            }
            link = st.toString();
        }
        return link;
    }
}
