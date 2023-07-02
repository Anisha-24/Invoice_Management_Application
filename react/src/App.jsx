
import './App.css';
import { DataGrid } from '@mui/x-data-grid';
import Datagrid from './Component/Datagrid';
import Header from './Component/Header';

import React from 'react';

function App() {
  return (
    <div className="App">
      <Header/>
     <Datagrid/>
 
    </div>
  );
}

export default App;
