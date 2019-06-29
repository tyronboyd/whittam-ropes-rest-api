package com.whittam.ropes.model;

/**
 * Created by tyronboyd on 22/6/19.
 */
public class MakeupSearchOptions {

    private boolean booleanSearch = false;
    private boolean facetSearch = false;
    private String sortBy = null;
    private boolean isAscending;
    private Integer curPageNumber;
    private Integer maxResults;
    private String searchByRef;

    public boolean isBooleanSearch() {
        return booleanSearch;
    }

    public void setBooleanSearch(boolean booleanSearch) {
        this.booleanSearch = booleanSearch;
    }

    public boolean isFacetSearch() {
        return facetSearch;
    }

    public void setFacetSearch(boolean facetSearch) {
        this.facetSearch = facetSearch;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public boolean isAscending() {
        return isAscending;
    }

    public void setIsAscending(boolean isAscending) {
        this.isAscending = isAscending;
    }

    public Integer getCurPageNumber() {
        return curPageNumber;
    }

    public void setCurPageNumber(Integer curPageNumber) {
        this.curPageNumber = curPageNumber;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public String getSearchByRef() {
        return searchByRef;
    }

    public void setSearchByRef(String searchByRef) {
        this.searchByRef = searchByRef;
    }
}
