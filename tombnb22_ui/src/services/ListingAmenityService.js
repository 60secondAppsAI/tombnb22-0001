import http from "../http-common";

class ListingAmenityService {
  getAllListingAmenitys(searchDTO) {
    console.log(searchDTO)
    return this.getRequest(`/listingAmenity/listingAmenitys`, searchDTO);
  }

  get(listingAmenityId) {
    return this.getRequest(`/listingAmenity/${listingAmenityId}`, null);
  }

  findByField(matchData) {
    return this.getRequest(`/listingAmenity?field=${matchData}`, null);
  }

  addListingAmenity(data) {
    return http.post("/listingAmenity/addListingAmenity", data);
  }

  update(data) {
  	return http.post("/listingAmenity/updateListingAmenity", data);
  }
  
  uploadImage(data,listingAmenityId) {
  	return http.postForm("/listingAmenity/uploadImage/"+listingAmenityId, data);
  }




	postRequest(url, data) {
		return http.post(url, data);
      };

	getRequest(url, params) {
        return http.get(url, {
        	params: params
        });
    };

}

export default new ListingAmenityService();
