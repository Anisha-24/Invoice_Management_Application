import React, { useState, useEffect } from 'react';
import { DataGrid, GridPagination } from '@mui/x-data-grid';
import { Button, Select, MenuItem } from '@material-ui/core';
import { makeStyles } from '@material-ui/styles';

const useStyles = makeStyles({
  root: {
    color: '#ffffff',
    backgroundColor: '#666666',
  },
  gridContainer: {
    border: '5px solid #ccc',
    borderColor: '#fc7500', // Customize the color of the border
  },
  dataGrid: {
    border: '8px solid #fc7500', // Customize the border thickness and color
  },
});

const Datagrid = () => {
  // State variables
  const [data, setData] = useState([]); // Holds the fetched data
  const [entries, setEntries] = useState(10); // Number of entries per page
  const [page, setPage] = useState(0); // Current page number (0-based index)

  // Fetch data from the server when 'entries' or 'page' changes
  useEffect(() => {
    // Function to fetch data from the server
    const fetchData = async () => {
      try {
        // Fetching the JSON data from the server
        const response = await fetch(
          `http://localhost:8080/h2h_milestone_3/data` // Add 1 to page for server-side pagination
        );
        const jsonData = await response.json();
        setData(jsonData);
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchData();
  }, []);

  // Columns configuration for the DataGrid
  // Columns configuration for the DataGrid
const columns = [
  { field: "slNo", headerName: "Sl.no", width: 150,sortable: true,},
  { field: "customerOrderID", headerName: "CustomerOrderID", width: 200 },
  { field: "salesOrg", headerName: "SalesOrg", width: 150 },
  { field: "distributionChannel", headerName: "DistributionChannel", width: 250 },
  { field: "companyCode", headerName: "CompanyCode", width: 200 },
  { field: "orderCreationDate", headerName: "OrderCreationDate", width: 200 },
  { field: "orderAmount", headerName: "OrderAmount", width: 200 },
  { field: "orderCurrency", headerName: "OrderCurrency", width: 180},
  { field: "customerNumber", headerName: "CustomerNumber", width: 200},
];

// Rows configuration for the DataGrid
const rows = data.map((item) => ({
  id: item.slNo, // Use the correct field name here (slNO instead of slNo)
  slNo: item.slNo, // Use the correct field name here (slNO instead of slNo)
  customerOrderID: item.customerOrderID,
  salesOrg: item.salesOrg,
  distributionChannel: item.distributionChannel,
  companyCode: item.companyCode,
  orderCreationDate: item.orderCreationDate,
  orderAmount: item.orderAmount,
  orderCurrency: item.orderCurrency,
  customerNumber: item.customerNumber,
}));



  const classes = useStyles();
 
  return (
    <div>
      {/* Data Grid */}
      <div className={`${classes.root} ${classes.dataGrid}`}>
      <DataGrid
  columns={columns}
  rows={rows}
  page={page}
  onPageChange={(newPage) => setPage(newPage)}
  pageSize={entries}
  onPageSizeChange={(newPageSize) => setEntries(newPageSize)}
  rowsPerPageOptions={[5, 8, 10, 20, 50]} // Array of available options
  pagination
  autoHeight
  checkboxSelection
  components={{
    Pagination: GridPagination,
    
      
    
  }}
 
/>
<div style={{ display: 'flex', alignItems: 'center', marginLeft: '16px' }}>
        <Button variant="contained" color="#fc7500 " style={{ marginLeft: '16px ',backgroundColor: '#fc7500'}} >
          Refresh
        </Button>
        <Button variant="contained" color="#fc7500" style={{ marginLeft: '16px ',backgroundColor: '#fc7500'}}>
          Edit
        </Button>
        <Button variant="contained" color="orange"  style={{ marginLeft: '16px ',backgroundColor: '#fc7500'}}>
          Delete
        </Button>
        <Button variant="contained" color="primary"  style={{ marginLeft: '16px'}}>
          Predict
        </Button>
      </div>

      
      </div>

    
    </div>
  );
};

export default Datagrid;
