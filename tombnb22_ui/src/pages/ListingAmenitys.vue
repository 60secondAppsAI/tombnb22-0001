<template>
  <div class="content">
    <div class="row">
      <div class="col-12">
        <card class="card-plain">
          <!-- <template slot="header">
            <h4 class="card-title">Table on Plain Background</h4>
            <p class="category">Here is a subtitle for this table</p>
          </template>-->
          <div class="table-full-width text-left">
            <listingAmenity-table
            v-if="listingAmenitys && listingAmenitys.length > 0"
				:title="table1.title"
				:sub-title="table1.subTitle"
				:listingAmenitys="listingAmenitys"
				:totalElements="totalElements"
				:page="page"
				:columns="table1.columns"
 				@get-all-listing-amenitys="getAllListingAmenitys"
             >

            </listingAmenity-table>
          </div>
        </card>
      </div>

    </div>
  </div>
</template>
<script>
import { Card } from "@/components/index";

import ListingAmenityTable from "@/components/ListingAmenityTable";
import ListingAmenityService from "../services/ListingAmenityService";

const tableColumns = [];
const tableData = [
];

export default {
  components: {
    Card,
    ListingAmenityTable,
  },
  data() {
    return {
      listingAmenitys: [],
	  totalElements: 0,
      page: 0,
      searchQuery: '',     
      table1: {
        title: "Simple Table",
        columns: [...tableColumns],
        data: [...tableData],
      },
    };
  },
  methods: {
    async getAllListingAmenitys(sortBy='listingAmenityId',sortOrder='true',page="0",size="50") {
      try {
        try {
			const searchDTO = {
				sortBy: sortBy, 
				sortOrder: sortOrder, 
				searchQuery: this.searchQuery,
				page: page, 
				size: size
			};
	        let response = await ListingAmenityService.getAllListingAmenitys(searchDTO);
	        if (!response.data.empty) {
		        if (response.data.listingAmenitys.length) {
					this.listingAmenitys = response.data.listingAmenitys;
				}
      			this.totalElements = response.data.totalElements;
      			this.page = response.data.page;
	        }
        } catch (error) {
          console.error("Error fetching listingAmenitys:", error);
        }
        
      } catch (error) {
        console.error("Error fetching listingAmenity details:", error);
      }
    },
  },
  mounted() {
    this.getAllListingAmenitys();
  },
  created() {
    this.$root.$on('searchQueryForListingAmenitysChanged', (searchQuery) => {
    	this.searchQuery = searchQuery;
    	this.getAllListingAmenitys();
    })
  }
};
</script>
<style></style>
