import React from 'react';

export const Tag = ({ children }) => (
  <div style={{
    width: 140,
    height: 20,
    left: 243,
    top: 412,
    background: '#9A031E',
    alignItems: 'center',
    textAlign: 'center',
    color: '#FFFFFF',
    marginTop: 40
  }} >
    {children}
  </div>
);