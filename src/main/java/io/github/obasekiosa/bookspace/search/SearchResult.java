package io.github.obasekiosa.bookspace.search;

import java.util.List;

public class SearchResult {
    
    private Integer numFound;

    private Integer start;

    private Boolean numFoundExact;

    private String q;

    private Integer offset;

    private List<SearchResultBook> docs;

    public int getNumFound() {
        return numFound;
    }

    public void setNumFound(int numFound) {
        this.numFound = numFound;
    }

    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Boolean getNumFoundExact() {
        return numFoundExact;
    }

    public void setNumFoundExact(Boolean numFoundExact) {
        this.numFoundExact = numFoundExact;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public List<SearchResultBook> getDocs() {
        return docs;
    }

    public void setDocs(List<SearchResultBook> docs) {
        this.docs = docs;
    }

    @Override
    public String toString() {
        return "SearchResult [docs=" + docs + ", numFound=" + numFound + ", numFoundExact=" + numFoundExact
                + ", offset=" + offset + ", q=" + q + ", start=" + start + "]";
    }


    
    

    
}
