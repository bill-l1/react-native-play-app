import * as types from '../types';

const loadUsersStart = () => ({
  type: types.LOADING_USERS,
});

const setUsers = (users) => ({
  type: types.SET_USERS,
  users
});

export const loadUsers = () => (dispatch) => {
  dispatch(loadUsersStart());
  console.log("Loading....");
  // const res = await fetch("https://randomuser.me/api/?results=20");
  // fetch("https://randomuser.me/api/?results=20")
  fetch("http://localhost:9000/v1/rand/?results=20")
    .then(res => {
      res.json().then(results => {
        console.log(results.results);
        dispatch(setUsers(results.results))
      });

    });
    //TODO error handling
};

export const deleteUser = (index) => ({
  type: types.DELETE_USER,
  index
})

export const setUserStart = (index, data) => ({
  type: types.SET_USER_START,
  index,
  data
})

export const editUser = (data) => ({
  type: types.EDIT_USER,
  data
})

export const setUser = (index, data) => ({
  type: types.SET_USER,
  index,
  data
})
