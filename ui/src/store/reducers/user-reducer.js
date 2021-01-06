import * as types from '../types';

const initState = {
  users: [],
  loading: false,
  editing: false,
  editingUser: -1,
  editingUserData: {name:{}},
  error: null
};

const userReducer = (state = initState, action) => {
  switch (action.type) {
    case types.LOADING_USERS:
      return {
        ...state,
        loading: true
      }
    case types.SET_USERS:
      return {
        ...state,
        users: action.users,
        loading: false
      }
    case types.DELETE_USER:
      const newUsers = JSON.parse(JSON.stringify(state.users));
      newUsers.splice(action.index, 1);
      return {
        ...state,
        users: newUsers
      }
    case types.SET_USER_START:
    console.log('set user start')
    const parseUser = JSON.parse(JSON.stringify(action.data))
      return {
        ...state,
        editing: true,
        editingUser: action.index,
        editingUserData: parseUser,
      }
    case types.EDIT_USER:
      return {
        ...state,
        editingUserData: {...action.data}
      }
    case types.SET_USER:
    console.log('set user')
      const newUsers2 = JSON.parse(JSON.stringify(state.users));
      newUsers2[action.index] = {...newUsers2[action.index], ...action.data};
      return {
        ...state,
        users: newUsers2,
        editing: false,
        editingUser: -1,
        editingUserData: {name:{}}
      }
    default:
      return state;
  }
}

export default userReducer;
