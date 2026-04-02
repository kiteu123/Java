import { createSlice } from "@reduxjs/toolkit";

// 초기 상태
const initialState = {
  value: 0,
};

export const counterSlice = createSlice({
  name: "counter",
  initialState,
  reducers: {
    increment: (state) => {
      state.value += 1;
    },
    decrement: (state) => {
      state.value -= 1;
    },
    reset: (state) => {
      state.value = 0;
    },
  },
});

// 액션 export
export const { increment, decrement, reset } = counterSlice.actions;

// reducer export
export default counterSlice.reducer;
