import React from "react";
import { ScrollView, ActivityIndicator, StyleSheet, View } from "react-native";
import UserList from "./user-list";
import UserEditModal from "./user-edit-modal"

import { connect } from "react-redux";
import actions from "./store/actions";

class Home extends React.Component {

  componentDidMount() {
    this.props.loadUsers();
  }

  render() {
    return (
      <ScrollView
        noSpacer={true}
        noScroll={true}
        style={styles.container}
      >
      {this.props.loadingUsers ? (
         <ActivityIndicator
           style={[styles.centering, styles.gray]}
           color="#ff8179"
           size="large"
         />
       ) : (
         <View>
           <UserEditModal
              visible={this.props.editingUser}
              index={this.props.editingUserIndex}
              user={this.props.editingUserData}
              editUser={this.props.editUser}
              stopEdit={this.props.stopEdit}
           />
           <UserList
              users={this.props.users}
              deleteUser={this.props.deleteUser}
              startEdit={this.props.startEdit}
           />
         </View>
       )}
      </ScrollView>
    );
  }
}

var styles = StyleSheet.create({
  container: {
    backgroundColor: "whitesmoke"
  },
  centering: {
    alignItems: "center",
    justifyContent: "center",
    padding: 8,
    height: '100vh'
  },
});

const mapStateToProps = state => ({
  users: state.users.users,
  loadingUsers: state.users.loading,
  editingUser: state.users.editing,
  editingUserIndex: state.users.editingUser,
  editingUserData: state.users.editingUserData
});

const mapDispatchToProps = dispatch => ({
  loadUsers: () => dispatch(actions.loadUsers()),
  deleteUser: (index) => dispatch(actions.deleteUser(index)),
  startEdit: (index, data) => dispatch(actions.setUserStart(index, data)),
  editUser: (data) => dispatch(actions.editUser(data)),
  stopEdit: (index, data) => dispatch(actions.setUser(index, data))
});

export default connect(mapStateToProps, mapDispatchToProps)(Home);
