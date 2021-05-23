USE [HRSchema]
GO

/****** Object:  StoredProcedure [dbo].[SP_GET_EMPLOYEE_WORKING_HOURS_HISTORY]    Script Date: 7/17/2018 10:50:50 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[SP_GET_EMPLOYEE_WORKING_HOURS_HISTORY]
	-- Add the parameters for the stored procedure here
	@employeeID int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT date, arrivalTime, depatureTime, hours, minutes, seconds
	FROM [dbo].[EmployeeWorkingHours]
	WHERE FK_EmployeeID = @employeeID
END


GO

